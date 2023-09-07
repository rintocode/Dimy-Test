<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Costumer extends Model
{
    use HasFactory;
    protected $fillable = [ 'customer_name'];
    public function customerAddress()
    {
        return $this->hasMany(CustomerAddress::class);
    }

}
